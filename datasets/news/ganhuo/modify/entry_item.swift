import SwiftUI
struct entry_item: View {
    
    var body: some View {
        ZStack()
        {
            ZStack
            {
                VStack
                {
                    HStack
                    {
                        Spacer()
                        VStack
                        {
                            Text("")
                                .padding(.bottom,10)
                                .font(.system(size: 18))
                                .foregroundColor(Color(red:0.0,green:0.0,blue:0.0,opacity:1.0))
                            Text("")
                                .foregroundColor(Color(red:0.4,green:0.4,blue:0.4,opacity:1.0))
                                .lineLimit(2)
                        }
                    }
                    Image("")
                        .frame(minWidth:80,idealWidth:80,minHeight:80,idealHeight:80)
                        .padding(.trailing,10)
                        .padding(.trailing,10)
                }
                Text("")
                    .foregroundColor(Color(red:0.4,green:0.4,blue:0.4,opacity:1.0))
            }
            .frame(minWidth:0,maxWidth:.infinity,minHeight:100,idealHeight:100)
            .padding(.top,5)
            .padding(.bottom,5)
            .padding(.leading,10)
            .padding(.trailing,10)
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:100,idealHeight:100)
        .padding(.top,5)
        .padding(.bottom,5)
        .padding(.leading,10)
        .padding(.trailing,10)}}

struct entry_item_Previews: PreviewProvider {
    static var previews: some View {
        entry_item()
    }
}
