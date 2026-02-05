import SwiftUI
struct activity_start: View {
    
    var body: some View {
        ZStack
        {
            VStack
            {
                Rectangle()
                    .fill(Color(red:0.8117647,green:0.8117647,blue:0.8117647,opacity:1.0))
                    .frame(minWidth:0,maxWidth:.infinity,minHeight:1,idealHeight:1)
                ProgressView()
                    .frame(minWidth:0,maxWidth:.infinity,minHeight:2,idealHeight:2)
            }

            HStack
            {
                Text("1 memo deleted")
                    .frame(minWidth:0,idealWidth:0,minHeight:45,idealHeight:45)
                    .foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
                Button(action: {})
                {
                    Text("Undo")
                        .foregroundColor(.black)
                }
                .frame(minHeight:45,idealHeight:45)
                .background(Color.blue)
            }
            .frame(minWidth:0,maxWidth:.infinity,minHeight:45,idealHeight:45)
            .padding(.bottom)
            .padding(.leading,15)
            .padding(.trailing,15)
            .background(Color(red:1.0,green:0.28627452,blue:0.0,opacity:1.0))
            HStack
            {
                Text("Connect EverNote？")
                    .frame(minWidth:0,idealWidth:0,minHeight:45,idealHeight:45)
                    .font(.system(size: 16))
                    .foregroundColor(Color(red:1.0,green:1.0,blue:1.0,opacity:1.0))
                Button(action: {})
                {
                    Text("Connect")
                        .foregroundColor(.black)
                }
                .frame(minHeight:45,idealHeight:45)
                .background(Color.gray)
            }
            .frame(minWidth:0,maxWidth:.infinity,minHeight:45,idealHeight:45)
            .padding(.bottom)
            .padding(.leading,15)
            .padding(.trailing,15)
            .background(Color.gray)
            
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
        .background(Color(red:0.90588236,green:0.90588236,blue:0.90588236,opacity:1.0))}}

struct activity_start_Previews: PreviewProvider {
    static var previews: some View {
        activity_start()
    }
}
