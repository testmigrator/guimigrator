import SwiftUI
struct activity_main: View {
    
    var body: some View {
        ScrollView
        {
            VStack
            {
                TextField("", text: .constant(""))
                List
                {
                    ForEach(1..<10)
                    {
                        index in
                        Text("Item \(index)")
                    }
                }
                .listStyle(PlainListStyle())
                .padding(.top,20)
                HStack()
                {
                    Button(action: {})
                    {
                        Text("SAY IT!")
                            .foregroundColor(.black)
                    }
                    .background(Color.white)
                }
                .padding(.top,15)
                .padding(.bottom,20)
                Text("Write it up!nAnd don't forget to give feedback and report bugs")
                    .padding(.top,15)
            }
            .padding(.top,20)
            .padding(.bottom,16)
            .padding(.leading,16)
            .padding(.trailing,16)
        }
        .frame(minHeight:0,maxHeight:.infinity)}}

struct activity_main_Previews: PreviewProvider {
    static var previews: some View {
        activity_main()
    }
}
