import SwiftUI
struct progress_bar: View {
    
    var body: some View {
        VStack//update
        {
            HStack
            {
                Rectangle{}
                    .frame(minWidth:0,idealWidth:0,minHeight:0,maxHeight:.infinity)
                Rectangle{}
                    .frame(minWidth:0,idealWidth:0,minHeight:0,maxHeight:.infinity)
            }
            .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
            HStack
            {
                Rectangle{}
                    .frame(minWidth:0,idealWidth:0,minHeight:0,maxHeight:.infinity)
                Rectangle{}
                    .frame(minWidth:0,idealWidth:0,minHeight:0,maxHeight:.infinity)
            }
            .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)
        }
        .frame(minWidth:0,maxWidth:.infinity,minHeight:0,maxHeight:.infinity)}}

struct progress_bar_Previews: PreviewProvider {
    static var previews: some View {
        progress_bar()
    }
}
